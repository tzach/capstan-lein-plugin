(ns leiningen.capstan
  (:use [leiningen.help :only (help-for)]
        [leiningen.core.main :only (info)]
        [leiningen.uberjar :only(uberjar)]
        [clojure.java.shell :only (sh)]))

(defn run-if-dir [project cmd & args]
  "run a command only if in the project directory"
  (let [warning (str "use " cmd " in a project directory only")]
    (if (:root project)
      (info (:out (apply sh "capstan" cmd args)))
      (info warning)))
  (info (str cmd " done!")))
 
(defn rmi
  "Remove image"
  [project]
  (run-if-dir project "rmi" (:name project)))

(defn build
  "Build image"
  [project]
  (uberjar project)
  (run-if-dir project "build"))

(defn capstan
  "Build OSv virtual appliance"
  {:help-arglists '([rmi build])
   :subtasks [#'rmi #'build]}
  ([project]
     (info (help-for "lein-osv")))
  ([project subtask & args]
     (case subtask
       "rmi" (apply rmi project args)
       "build" (apply build project args)
       (info (help-for "osv")))))
