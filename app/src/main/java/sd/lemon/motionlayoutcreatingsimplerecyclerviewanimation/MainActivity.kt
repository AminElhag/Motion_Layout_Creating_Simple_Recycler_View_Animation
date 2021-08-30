package sd.lemon.motionlayoutcreatingsimplerecyclerviewanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var itemsAdapter: ItemsAdapter = ItemsAdapter()
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemsAdapter.setData(foodDummyData)
        recyclerView = findViewById(R.id.rvMain)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = itemsAdapter
    }


    private val foodDummyData: ArrayList<FoodModel> = arrayListOf(
        FoodModel(
            "Salmon Salad",
            "One of the easiest equations for a wholesome meal is vegetables + salmon. Both are packed with nutrients like protein, healthy fats, and fiber that just make you feel good with every single bite, and this simple recipe is proof",
            "80cal",
            "4.5 rating",
            R.drawable.img_salmon_salad
        ),
        FoodModel(
            "BBQ Chicken Breast",
            "BBQ chicken, whether cooked on the grill or baked in the oven, is one of those dinners nobody at the table will complain about.Unless it’s dry and overcooked. But that is NOT this recipe. It’s a basic anyone can easily master, so that they too can claim their BBQ chicken is the best on the block.",
            "80cal",
            "4.5 rating",
            R.drawable.img_chicken
        ),
        FoodModel(
            "Steamed Chicken and Rice",
            "Steaming is an ideal method for cooking boneless chicken breasts and small whole birds such as Cornish hens. It retains the flavor, tenderness and moisture through the use of steam. It is a healthy method of cooking because no additional fat is used.",
            "80cal",
            "4.5 rating",
            R.drawable.img_chicken_rice
        ),
        FoodModel(
            "Caesar Salad",
            "A green salad of romaine lettuce and croutons dressed with lemon juice (or lime juice), olive oil, egg, Worcestershire sauce, anchovies, garlic, Dijon mustard, Parmesan cheese, and black pepper.",
            "80cal",
            "4.5 rating",
            R.drawable.img_salad
        ),
        FoodModel(
            "Wholesome Meal",
            "One of the easiest equations for a wholesome meal is vegetables + salmon. Both are packed with nutrients like protein, healthy fats, and fiber that just make you feel good with every single bite, and this simple recipe is proof",
            "80cal",
            "4.5 rating",
            R.drawable.img_healthy
        )
    )
}