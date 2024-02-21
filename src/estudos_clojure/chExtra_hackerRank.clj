(ns estudos-clojure.chExtra-hackerRank)

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