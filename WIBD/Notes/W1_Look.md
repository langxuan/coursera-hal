# Web Intelligence and Big Data >> Look
***
## Basic Indexing
* looking means finding stuff, means finding **documents** while on the web
* text indexing is realized by inverted index
* if there are *m* terms, each related to a series of docs, then the query takes *O(log m)* or less with hash techs. If there's a *q*-term query, like five-term query "web intelligence and big data", we have to assemble results of each of the five result sets. Assume the assembled results contains *x* docs in total, the complexity is *O(qx)*
                                                                                                                                                                                                                                                                                              
***
## Index Creation
* description of how to create the inverted index

***
## Complexity of Index Creation
* how fast (*n* docs, *m* words, *w* words per doc)
    + *O(nw logm)* (if a balanced binary tree is used for the words)

***
## Ranking
1.

* use the search results of 'a' in Google to estimate the scale of web

2.

* brief introduction of the page-rank algorithm

***
## Page Rank and Memory
* as the word-word associations and letter-word associations in **semantic network**, the page-page associations and word-page associations in WWW can be used to decide the page-rank value(Google and the Mind)
* difference between how human memory and search works

***
## Google and the Mind
* the professor thinks that we are easier to just Google anything instead of relying on hyperlinks, so newer pages have fewer hyperlinks, which is bad for pagerank. In this way, the more we use pagerank, it ges worse. (I'm not buying it!)
* the click feedback can improve searching
* although the easy Google process makes it less for us to recall facts, it provides us much more facts which are of great help to reasoning, which leads to an unknown answer to what effect Google has on human mind

***
## Enterprise Search
* due to lack of obvious links between desktop documents, pagerank cannot be applied. So we need to capture other associations like similar names or user behaviour for private search
* enterprise search faces much more challenges than private search

***
## Searching Structured Data
* difficulties while searching the structured data

***
## Object Search
* objects have little common features which makes the pagerank algorithm well-used for documents search inappropriate
* **locality sensitive hashing(LSH)**

***
## LSH
* 