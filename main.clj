(ns json-parser-clj.main)

; 加这个 type hint 性能提高一倍
(defn ^long perform []
  (loop [s 0
         i 1]
    (if (< i 10000001)
      (recur (+ s i) (inc i))
      s)))

(defn -main []
  (do
    (println (perform))
    (time (perform))
    (time (perform))
    (time (perform))
    (time (perform))
    (time (perform))
    (time (perform))
    (time (perform))
    (time (perform))
    (time (perform))
    (time (perform))
    (time (perform))
    (time (perform))
    (time (perform))
    ))