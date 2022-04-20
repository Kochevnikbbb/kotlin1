package kg.geektech.kotlin1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import kg.geektech.kotlin1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var registerForActivityResult: ActivityResultLauncher<Intent>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            if (binding.etText1.text.toString().isEmpty()) {
                val text = getString(R.string.error)
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()

            } else {
                Intent(this@MainActivity, SecondActivity::class.java).apply {
                    putExtra("sdfsd", binding.etText1.text.toString())
                    registerForActivityResult.launch(this)
                }
            }
        }
        registerForActivityResult = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { result ->
            binding.etText1.setText(result.data?.getStringExtra("sdfgdssdg"))
        }
    }
}