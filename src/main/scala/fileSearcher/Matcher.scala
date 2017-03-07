package fileSearcher

/**
  * Created by shahzada.mansoor on 3/6/17.
  */
class Matcher(filter: String, rootLocation:String) {
  val rootIOObject = FileConverter.convertToIOObject(new File(rootLocation))


}
