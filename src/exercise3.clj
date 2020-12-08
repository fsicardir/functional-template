(ns exercise3)

(defn fibonacci
  "Calculates the fibonacci result fo the given input value."
  [x]
  (case x
    0 0
    1 1
    (+ (fibonacci (dec x)) (fibonacci (- x 2))))
)




