    package com.example.tourisim

    import android.annotation.SuppressLint
    import android.os.Bundle
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.RadioButton
    import android.widget.RadioGroup
    import android.widget.TextView
    import androidx.fragment.app.Fragment


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private const val ARG_PARAM1 = "param1"
    private const val ARG_PARAM2 = "param2"

    /**
     * A simple [Fragment] subclass.
     * Use the [BlankFragment.newInstance] factory method to
     * create an instance of this fragment.
     */
    @Suppress("UNREACHABLE_CODE")
    class BlankFragment : Fragment() {
        // TODO: Rename and change types of parameters
        private var param1: String? = null
        private var param2: String? = null

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)


            arguments?.let {
                param1 = it.getString(ARG_PARAM1)
                param2 = it.getString(ARG_PARAM2)
            }
        }

        private fun findViewById(radioGroup: Any) {

        }

        @SuppressLint("SetTextI18n")
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            val view = inflater.inflate(R.layout.fragment_blank, container, false)
            val radioGroup = view.findViewById<RadioGroup>(R.id.radio)
            val textView = view.findViewById<TextView>(R.id.text_view)

            radioGroup.setOnCheckedChangeListener { group, checkedId ->
                // Get the checked radio button from the radio group
                when (checkedId) {
                    R.id.R1 -> textView.text = "Swim only in designated and safe areas with lifeguards on duty in Jordan, and be aware of potential hazards and water conditions before entering."
                    R.id.R3 -> textView.text = "Choose a suitable trail for your fitness level and experience, and research the area beforehand to ensure you have appropriate gear and supplies for a safe and enjoyable hike."
                    R.id.R2 -> textView.text = "Experiencing cultural food can be a great way to learn about and appreciate different cultures. Look for local restaurants and markets that specialize in traditional cuisine, and be open to trying new flavors and dishes."
                    R.id.R4-> textView.text = "Climbing can be a thrilling and challenging activity, but it's important to prioritize safety. Choose a climbing route and location that aligns with your skill level and experience, and use appropriate gear and equipment."
                    // Add more cases for each radio button
                }
            }

            return view
        }


        internal object taya {
            /**
             * Use this factory method to create a new instance of
             * this fragment using the provided parameters.
             *
             * @param param1 Parameter 1.
             * @param param2 Parameter 2.
             * @return A new instance of fragment BlankFragment.
             */
            // TODO: Rename and change types and number of parameters
            @JvmStatic
            fun newInstance(param1: String, param2: String): BlankFragment {
                return BlankFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
            }
        }
    }