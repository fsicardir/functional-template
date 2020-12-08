(ns exercise9)

(defn word-count 
  "Returns a map where each key is a distinct word in a given sentence and each value is the number of occurences of that word in the sentence."
  [x]
  (-> x
       (clojure.string/lower-case)
       (clojure.string/split #" ")
       (->> (map (fn [w] (filter #(Character/isLetterOrDigit %) w)))
            (map #(clojure.string/join %))
            (filter #(not= "" %)))
       frequencies)
)




