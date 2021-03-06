(ns accross-clj.routes.home
  (:require [compojure.core :refer :all]
            [accross-clj.layout :as layout]
            [accross-clj.util :as util]))

(defn home-page []
  (layout/render
    "home.html" {:content (util/md->html "/md/docs.md")}))

(defn about-page []
  (layout/render "about.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page)))
