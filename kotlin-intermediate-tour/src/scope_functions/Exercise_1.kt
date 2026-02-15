package scope_functions

data class ProductInfo(val priceInDollars: Double?)

class Product {
  fun getProductInfo(): ProductInfo? {
    return ProductInfo(100.0)
  }
}

// Rewrite this function
/*fun Product.getPriceInEuros(): Double? {
  val info = getProductInfo()
  if (info == null) return null
  val price = info.priceInDollars
  if (price == null) return null
  return convertToEuros(price)
}
*/
fun Product.getPriceInEuros() = getProductInfo()?.priceInDollars?.let {convertToEuros(it)}

fun convertToEuros(dollars: Double): Double {
  return dollars * 0.85
}

fun main() {
  val product = Product()
  val priceInEuros = product.getPriceInEuros()

  if (priceInEuros != null) {
    println("Price in Euros: €$priceInEuros")
    // Price in Euros: €85.0
  } else {
    println("Price information is not available.")
  }
}