(ns json-parser-clj.main)


(defn perform []
  (reduce + (range 10000001)))


(defn -main []
  (do
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