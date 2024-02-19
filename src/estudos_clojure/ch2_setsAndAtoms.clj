(ns estudos-clojure.ch2-setsAndAtoms)

;Creates a set
#{}

;Creates a set and adds an element to it with conj (conjoin)
(println (conj #{} "Element"))

;Creates an atom (although there are many other reference types)
(atom #{})

;Creates an atom named "fruits"
(def fruits (atom #{}))

;Updates "fruits" with the conj function
(swap! fruits conj "Grape")

;Some ways to look inside a named set
(println fruits)
(println (deref fruits))
(println @fruits)

(defn add-fruit
  [fruit]
  (swap! fruits conj fruit)
  (println "Adding" fruit))

(add-fruit "Cherry")
(println @fruits)