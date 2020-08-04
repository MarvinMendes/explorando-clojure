(ns explorando_funcional.aula-tres)

(defn obter-desconto [valor-bruto] (* valor-bruto 0.9))

(println (obter-desconto 100))

; predicate
(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(println aplica-desconto? 100)
(println aplica-desconto? 1000)

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))


(println obter-desconto 100)
(println obter-desconto 1000)