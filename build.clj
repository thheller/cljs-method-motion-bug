(require '[cljs.build.api :as b])

(b/build
  "src/main"
  '{:verbose true
    :optimizations :advanced
    :pseudo-names true
    :pretty-print true
    :output-dir "public/js"
    :modules
    {:main {:entries [test.main]
            :output-to "public/js/main.js"}
     :mod-a {:entries [test.mod-a]
             :depends-on #{:main}
             :output-to "public/js/mod-a.js"}}})