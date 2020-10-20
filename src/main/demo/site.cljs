(ns demo.site
  (:require
    [reagent.core :as r]
    ["next/link" :default Link]))

(defn ^:export index [props]
  (r/as-element
   [:div
    [:h1 "Hi people!"]

    [:p "Welcome to your new next.js site."]
    [:p "Now go build something great with ClojureScript."]
    [:> Link {:href "/page-2"} [:a "goto page-2"]]]))
