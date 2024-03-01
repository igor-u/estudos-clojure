(ns estudos-clojure.hackerRank)

;Print a line N Times
(defn print_line_n_times [x]
  (dotimes [_ x] (println "Line")))
(print_line_n_times 2)

;Print each element in a list N times
(defn print_element_n_times [num lst]
  (doseq [x lst] (dotimes [_ num] (println x))))
(print_element_n_times 2 [1 2 3])

;Filter elements from list that are less than X
(defn filter_less_than_x [x lst]
  (doseq [y lst] (if (< y x) (println y))))
(filter_less_than_x 4 [1 2 3 4])

;Print only elements that have even indexes in list (assuming that the indexing starts at 1 instead of 0)
(defn print_elements_at_even_positions [lst]
  (doseq [x (take-nth 2 (rest lst))] (println x)))
(print_elements_at_even_positions [4 5 6])

;Returns a list with n times any value (x) - "replicate" could be used instead of repeat, but it is deprecated
(defn print_n_times_something [n x] (println (repeat n x)))
(print_n_times_something 2 "anything")

;Reverts a collection without using "reverse"
(defn reversion_without_reverse [lst] (println (reduce conj '() lst)))
(reversion_without_reverse [1 2 3])

;Sums all the odd values from a list
(defn odd_values_sum [lst] (println (reduce + (filter odd? lst))))
(odd_values_sum [1 2 3])

;Updates all values in a list with their absolute values
(defn absolute_values_in_list [lst] (println (map #(abs %) lst)))
(absolute_values_in_list [-2 -2 1])

;Factorial of n
(defn fact [n]
  (println  (reduce * (range 1 (inc n)))))
(fact 3)