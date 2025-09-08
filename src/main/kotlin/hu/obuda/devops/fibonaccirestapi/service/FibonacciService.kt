package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        require(n >= 1)
        return if (n == 1) 0
        else
            return if (n == 2) 1
        else
            return fibonacci(n-1) + fibonacci(n-2)
    }
}