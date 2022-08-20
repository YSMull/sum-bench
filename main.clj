(ns sum.core
  (:gen-class))

(defn ^long perform [n]
  (loop [s 0
         i 1]
    (if (< i n)
      (recur (+ s i) (inc i))
      s)))

(defn -main []
  (let [nums (map #(Integer/parseInt %) (clojure.string/split-lines "10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n"))]
    (doall (for [n nums]
      (time (perform n))))
    ))