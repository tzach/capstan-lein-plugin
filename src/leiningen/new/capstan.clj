(ns leiningen.new.capstan
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))


(def render (renderer "capstan"))

(defn capstan
  "template for Clojure project on OSv"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating a fresh Capstan project.")
    (->files data
             [".gitignore"  (render ".gitignore" data)]
             ["Capstanfile" (render "Capstanfile" data)]
             ["project.clj" (render "project.clj" data)]
             ["README.md"   (render "README.md" data)]
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
             )))
