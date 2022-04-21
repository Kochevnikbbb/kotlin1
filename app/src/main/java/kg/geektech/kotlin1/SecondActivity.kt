package kg.geektech.kotlin1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.geektech.kotlin1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.etText2.setText(intent.getStringExtra(MainActivity.MY_KEY))
        binding.btn2.setOnClickListener {
            setResult(
                RESULT_OK, Intent().putExtra(
                    MainActivity.MY_KEY2,
                    binding.etText2.text.toString()
                )
            )
            finish()
        }
    }
}