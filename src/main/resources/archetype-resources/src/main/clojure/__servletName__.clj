(ns $package.$servletName
  (:gen-class :extends javax.servlet.http.HttpServlet))

(defn -doGet [_ request response]
  (.setContentType response "text/html")
  (-> response
    .getWriter
    (.println "Hello World!")))

(defn -doPost [_ request response]
  (-doGet nil request response))