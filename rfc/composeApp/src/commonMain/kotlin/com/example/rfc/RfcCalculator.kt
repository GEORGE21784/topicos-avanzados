package com.example.rfc

object RfcCalculator {
   private val badWords = setOf(
      "BUEY", "CACA", "CAGA", "CAGX", "COGE", "COJE", "COJO", "CULO",
      "FETO", "GUEY", "JOTO", "KACA", "KACO", "KAGA", "KAGO", "KOJO",
      "KULO", "MAMX", "MAMO", "MEAR", "MEON", "MION", "MOCO", "MULA",
      "PEDA", "PEDO", "PENE", "PIPI", "PITO", "POPO", "PUTA", "PUTO",
      "QULO", "RATA", "ROBA", "ROBE", "ROBO", "RUIN", "SENO", "TETA",
      "VACA", "VAGA", "VAGO", "VIEJ", "VUEI", "VUEY", "WUEI", "WUEY"
   )

   private val badParticles = setOf("DE", "DEL", "LA", "LOS", "LAS", "Y", "MC", "MAC", "VON", "VAN")

   private val specialNames = setOf("JOSE", "J", "MARIA", "MA", "MA.")

   fun run(name: String, fatherName: String, motherName: String, birthDay: String): String {
      val fName = clean(fatherName)
      val mName = clean(motherName)
      val cName = name.trim().uppercase()
      if(fName.isEmpty() || cName.isEmpty() || birthDay.length != 6) return "..."
      val ans = StringBuilder().apply {
         append(fName.firstOrNull() ?: 'X')
         append(fName.drop(1).firstOrNull { it.isVowel() } ?: 'X')
         append(mName.firstOrNull() ?: 'X')
         append(getValid(cName))
      }
      var rfcKey = ans.toString().replace("Ñ", "X")
      if(badWords.contains(rfcKey)) rfcKey = rfcKey.dropLast(1) + "X"
      return rfcKey + birthDay
   }

   private fun Char.isVowel() = this in "AEIOUÁÉÍÓÚ"

   private fun clean(str: String): String {
      val words = str.trim().uppercase().split(" ").filter { it.isNotEmpty() }
      val filtered = words.filter { !badParticles.contains(it) }
      return if(filtered.isEmpty()) words.joinToString("") else filtered.joinToString(" ")
   }

   private fun getValid(fullName: String): Char {
      val words = fullName.split(" ").filter { it.isNotEmpty() }
      if(words.isEmpty()) return 'X'
      if(words.size > 1 && specialNames.contains(words[0])) {
         val secondName = words[1]
         if(!badParticles.contains(secondName))
            return secondName.first()
      }
      return words[0].first()
   }
}