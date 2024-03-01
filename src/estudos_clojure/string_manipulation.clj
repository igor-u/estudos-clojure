(ns estudos-clojure.string_manipulation)

;Java methods start with a dot
(println (.toUpperCase "java .toUpperCase method"))

;Java toString method (str). It skips nil
(println (str 1 2 nil 3))

;Characters in Clojure have the syntax \{char}
(println (str \S \t \r \i \n \g))

;Interleave function (returns a collection)
(println (interleave "ABC" "123"))

;Apply function builds a string
(println (apply str (interleave "ABC" "123")))