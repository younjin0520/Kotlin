class File(val path:String)

//두 파일 경로를 대소문자 관계없이 비교해주는 object
object CaseInsensitiveFileComparator:Comparator<File>{
    override fun compare(file1:File, file2:File):Int{
        return file1.path.compareTo(file2.path,ignoreCase=true)
    }
}

fun main(){
    println(CaseInsensitiveFileComparator.compare(File("/User"),File("/User")))
}