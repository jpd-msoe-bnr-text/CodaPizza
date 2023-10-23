package edu.msoe.demastri.codapizza.model

data class Pizza(
    val toppings: Map<Topping, ToppingPlacement> = emptyMap()
)