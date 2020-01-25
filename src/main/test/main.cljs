(ns test.main
  (:require
    [cljs.spec.alpha :as s]))

(s/def ::foo pos-int?)

(js/console.log "test.main init")
