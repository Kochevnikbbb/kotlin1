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

        binding.etText2.setText(intent.getStringExtra("sdfsd"))
        binding.btn2.setOnClickListener {
            setResult(
                RESULT_OK, Intent().putExtra(
                    "sdfgdssdg",
                    binding.etText2.text.toString()
                )
            )
            finish()
        }
    }
}