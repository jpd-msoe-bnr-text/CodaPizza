package edu.msoe.demastri.codapizza

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import edu.msoe.demastri.codapizza.model.Topping
import edu.msoe.demastri.codapizza.model.ToppingPlacement

@Preview
@Composable
private fun ToppingCellPreview() {
    ToppingCell(
        topping = Topping.Pepperoni,
        placement = ToppingPlacement.Left,
        onClickTopping = {}
    )
}

@Composable
public fun ToppingCell(
    topping: Topping,
    placement: ToppingPlacement?,
    onClickTopping: () -> Unit
) {
    Row {
        Checkbox(
            checked = true,
            onCheckedChange = { /* TODO */ }
        )

        Column {
            Text(
                text = "Pineapple"
            )

            Text(
                text = "Whole pizza"
            )
        }
    }
}