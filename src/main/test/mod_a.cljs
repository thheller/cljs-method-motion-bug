(ns test.mod-a
  (:require
    [cljs.spec.alpha :as s]
    [test.main :as main]))

(js/console.log "mod-a init")
(s/assert ::main/foo -1)