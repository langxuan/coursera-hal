import glob
import os
import re

execfile('stopwords.py')

input_files = glob.glob('hw3data/*')
								  
def file_contents(file_name):
	f = open(file_name)
	try:
		return f.read()
	finally:
		f.close()

source = dict((file_name, file_contents(file_name)) for file_name in input_files)
result_file = open('result', 'w')

def sort_result(d):
	items = d.items()
	backitems = [[v[1], v[0]] for v in items]
	backitems.sort()
	return backitems

def mapfn(key, value):
	for lines in value.splitlines():
		terms = lines.split(':::')
		for author in terms[1].split('::'):
			words = re.sub('[^A-Za-z0-9\- ]', '', terms[-1].lower())
			for word in words.split(' '):
				if word not in allStopWords and len(word) > 1:
					yield author, word

def reducefn(key, value):
	words = {}
	for word in value:
		if words.has_key(word):
			words[word] += 1
		else:
			words.setdefault(word, 1)
	return key, words

def final(key, value):
	try:
		result_file.writelines(value[0] + ':')
		result_file.writelines(str(sort_result(value[1])))
		result_file.write(os.linesep)
	except IOError, e:
		print e
