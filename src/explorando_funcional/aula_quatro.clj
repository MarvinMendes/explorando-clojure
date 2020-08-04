(ns explorando_funcional.aula-quatro)

(def precos [30 700 1000])
(println precos)

(println (get precos 1))

(println conj precos 5)
(println precos)

(defn soma-um [valor]
  println ("Estou somando um em " valor)
  (+ valor 1))

(println (update precos 0 inc))
(println (update precos 1 inc))
