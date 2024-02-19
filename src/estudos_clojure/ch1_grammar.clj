(ns estudos-clojure.ch1-grammar)

;Required argument notation
(defn print1 [required-arg] (println required-arg))
(print1 "A required argument")

(println "******")

;Required argument with format function
(defn print-format [arg]
  (println (format "Base text + %s" arg)))
(print-format "argument")

(println "******")

;Optional argument: ends with '?'
(defn print2 [is-empty?]
  (if (= is-empty? "") (println "Empty string"))
  (println is-empty?))
(print2 "Not empty")
(print2 "")

;Zero or more arguments: ends with '*'
;One or more arguments: ends with '+'

;Collection of arguments: starts with '&'
;(defn & [collection]

;Just an extra: concat function
(defn print3 [concat-string] (println (concat concat-string)))
(print3 "Text")