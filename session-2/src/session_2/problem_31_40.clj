(ns session-2.problem-31-40)

;; 31 - Easy
(defn p31 [s]
  (partition-by identity s))

(= (p31 [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
(= (p31 [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
(= (p31 [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))

;; 32 - Easy
(defn p32 [s]
  (mapcat #(repeat 2 %) s))

(= (p32 [1 2 3]) '(1 1 2 2 3 3))
(= (p32 [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
(= (p32 [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
(= (p32 [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))

;; 33 - Easy
(defn p33 [s n]
  (mapcat #(repeat n %) s))

(= (p33 [1 2 3] 2) '(1 1 2 2 3 3))
(= (p33 [:a :b] 4) '(:a :a :a :a :b :b :b :b))
(= (p33[4 5 6] 1) '(4 5 6))
(= (p33 [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))
(= (p33 [44 33] 2) [44 44 33 33])

;; 34 - Easy
(defn p34 [f e]
  (take (- e f) (iterate inc f)))

(= (p34 1 4) '(1 2 3))
(= (p34 -2 2) '(-2 -1 0 1))
(= (p34 5 8) '(5 6 7))