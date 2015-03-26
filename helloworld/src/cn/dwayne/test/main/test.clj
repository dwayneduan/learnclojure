(ns
  ^{:author CRDUAN}
  cn.dwayne.test.main.test)

(clojure.core/use 'clojure.core)

(println "This is my first clojure project!")

(println (str [1 2 3 4]))

;(def inventors {"Lisp" "McCarthy", "Clojure" "Hickey"})

(def inventors {:Lisp "McCarthy", :Clojure "Hickey"})

(println (inventors "Lisp"))
(println (inventors "Foo"))
(println (inventors :Clojure))
(println (get inventors "Foo" "Test fn get"))

;(doc inventors)     ;???????

(defn greeting
  "Returns a greeting of the form 'Hello, username.'"
  [username]
  (str "Hello, " username))

(println (greeting "Hickey"))
;(greeting)

(defn greeting2
  "Returns a greeting of the form 'Hello, username'
  Default username is 'world'."
  ([] (greeting "world"))
  ([username] (str "Hello, " username)))

(println (greeting2))


(println java.io.File/separator)

;clojure有点理解不了，暂时放一下，晚点再继续研究

