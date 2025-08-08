import java.util.*;

public class HASHMAP {
    public static void main(String[] args) {
        HashMap<String, Integer> cart = new HashMap<>();

        cart.put("Laptop", 1);
        cart.put("HeadPhones", 2);
        cart.put("USB Cable", 3);

        cart.put("HeadPhones", cart.get("HeadPhones") + 1);

        cart.put("Mouse", 1);

        System.out.println("Your Shopping Cart");
        for (Map.Entry<String, Integer> item : cart.entrySet()) {
            System.out.println("-" + item.getKey() + " x" + item.getValue());

        }

        cart.remove("USB Cable");
        System.out.println("\n USB Cable Removed from Cart.");

        System.out.println("All Products: " + cart.keySet());

        System.out.println("Quantities: " + cart.values());

        System.out.println("\nQuantity of HeadPhones: " + cart.get("HeadPhones"));

        System.out.println("Total unique Products: " + cart.size());

        cart.clear();
        System.out.println("Cart After clearing" + cart);
    }
}

// OutPut

// Your Shopping Cart
// -Laptop x1
// -Mouse x1
// -HeadPhones x3
// -USB Cable x3

// USB Cable Removed from Cart.
// All Products: [Laptop, Mouse, HeadPhones]
// Quantities: [1, 1, 3]

// Quantity of HeadPhones: 3
// Total unique Products: 3
// Cart After clearing{}
