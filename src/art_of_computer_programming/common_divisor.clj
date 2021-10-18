(ns art-of-computer-programming.common-divisor)

(defn highest-common-divisor
  "Higher divisable between two"
  [m n]
  ;(if (> n m)
  ;  {:first n :second m }
  ;  {:first m :second n }
  ;  )
  (let [

        r (mod m n)

        ]
    (if (= 0 r)
      n
      (highest-common-divisor n r)
      )
    )

  )
