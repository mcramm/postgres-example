(ns lazy-loading-example.components.postgres)

(defrecord Postgres [uri])

(defn build [uri]
  (->Postgres uri))
