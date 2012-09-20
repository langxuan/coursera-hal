# Web Intelligence and Big Data
***
## Preamble
* Listening, means discerning our intentions from our interactions with computers

***
## Shannon Information
* information needs surprise, an event has the probability *p* conveys -{\log}_{2}p bits of information

***
## Information and Advertising
* mutual information

***
## TF-IDF
* inverse search, means discerning the best keywords describing the content of the page to maximize the mutual information between the two
* how to find good keywords
 - rarer words make better keywords, inverse document frequency(IDF) of word *w* = {\log }_{2}\frac{N}{{N}_{w}}(N total documents, with Nw containing *w*)
 - more frequency words make better key words, precisely speaking, rarer words overall but more frequent in the certain document, if n_{w}^{d} = frequency of *w* in document *d*, TF-IDF = term frequency \* IDF = n_{w}^{d}{\log }_{2}\frac{N}{{N}_{w}}
 - words having a high TF-IDF are considered to be good keywords
* From the perspective of searching, one would use words with high IDF to search and those with high TF-IDF to index

***
## TF-IDF Example
* TF-IDF and mutual information, the mutual information between all pages and all words is propotional to \sum_{1}^{d}\sum_{1}^{w} TF-IDF
* we can use the web to estimate the IDF of a certain word

***
## Language and Information
* language is highly redundant
* Using documents and related keywords to construct a bi-partite graph, we are able to see which documents are similar since they contain the same keywords or which keywords are similar since they appear in the same document

***
## Machine Learning Intro
* one of the methods to identify whether someone is surfing or shopping is learning from past data(we can build a decision tree with the past behaviour including the action and related query keywords)
* conditional probability from past history can indicate the intention, however, when the number of keywords grow or no history for certain combination of keywords, it doesn't work

***
## Bayes Rule
* p(B, R) = p(B|R)p(R) = p(R|B)p(B)

***
## Naive Bayes
* "naive" means the assumption that all features used to predict the probability of the result event are independent
* all features should be taken into account other than just the query keywords
* foundation for all machine learning techniques

***
## Sentiment Analysis
* how naive bayesian classifier applied in sentiment analysis

***
## Mutual Information
* mutual information between F and B is defined as I(F, B) = \sum{f, b}^{}p(f, b)log\frac{p(f, b)}{p(f)p(b)}

***
## Machine Learning - Limits
* maximum mutual information between sender and receiver per second as the *capacity* of communications channels
* right bayesian classifier will eventually learn any concept, the problem is how fast, how much training is needed
* feature selection
