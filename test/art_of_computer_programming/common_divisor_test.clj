(ns art-of-computer-programming.common-divisor-test
  (:require [clojure.test :refer :all])
  (:require [art-of-computer-programming.common-divisor :refer [highest-common-divisor]]))



(defn assert-common-divisor-equals [m n expected]
  (is (= expected (highest-common-divisor m n)))
  )

(deftest highest-common-divisor-test
  (assert-common-divisor-equals 4 2 2)
  (assert-common-divisor-equals 2 4 2)
  (assert-common-divisor-equals 50 10 10)
  (assert-common-divisor-equals 15 4 1)

  )