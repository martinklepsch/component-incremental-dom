(ns cinc.app
  (:require [incremental-dom :as inc-dom]))

(defn render [txt]
  (inc-dom/elementOpen "div")
  (inc-dom/text txt)
  (inc-dom/elementClose "div"))

(defn init []
  (inc-dom/patch 
   (.getElementById js/document "container")
   #(render "test")))
