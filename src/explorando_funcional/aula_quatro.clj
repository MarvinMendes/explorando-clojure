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

(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println "Map" (map valor-descontado precos))
(println "Filter" (map valor-descontado (filter aplica-desconto? precos)))

