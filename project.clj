(defproject zhang "0.1.0-SNAPSHOT"
  :description "An implementation of the Erlang process model in Clojure
                core.async"
  :url "https://github.com/clojang/zhang"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[clojang "0.4.0-SNAPSHOT"]
                 [clojusc/twig "0.3.1"]
                 [dire "0.5.4"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.3.442"]
                 [org.clojure/core.match "0.3.0-alpha4"]
                 [potemkin "0.4.3"]]
  :plugins [[lein-simpleton "1.3.0"]]
  :repl-options {:init-ns zhang.dev}
  :test-selectors {:default :unit
                   :unit :unit
                   :system :system
                   :integration :integration}
  :codox {:output-path "docs/master/current"
          :doc-paths ["docs/source"]
          :namespaces [#"^zhang\.(?!test)"]
          :metadata {:doc/format :markdown}}
  :profiles {
    :uberjar {
      :aot :all}
    :docs {
      :aot :all
      :dependencies [[codox-theme-rdash "0.1.2"]]
      :plugins [
        [lein-codox "0.10.3"]
        [lein-simpleton "1.3.0"]]}
    :testing {
      :aot :all
      :dependencies [
        [clojusc/trifl "0.1.0-SNAPSHOT"]]
      :plugins [
        [lein-ancient "0.6.10"]
        [jonase/eastwood "0.2.3" :exclusions [org.clojure/clojure]]
        [lein-bikeshed "0.4.1"]
        [lein-kibit "0.1.4" :exclusions [org.clojure/clojure]]
        [venantius/yagni "0.1.4"]]
      :source-paths ["test"]
      :test-selectors {
        :default :unit
        :unit :unit
        :system :system
        :integration :integration}}
    :dev {
      :source-paths ["dev-resources/src"]}})
