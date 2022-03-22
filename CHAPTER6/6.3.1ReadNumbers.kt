import java.io.BufferedReader

// null이 될 수 있는 값으로 이뤄진 컬렉션 만들기
fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>()                      // null이 될 수 있는 Int 값으로 이루어진 리스트 생성
    for (line in reader.lineSequence()) {
        try {
            val number = line.toInt()
            result.add(number)                          // 정수를 리스트에 추가
        } catch (e: java.lang.NumberFormatException) {
            result.add(null)                            // 현재 줄을 파싱할 수 없으므로 리스트에 null을 추가
        }
    }
    return result
}

