package fileSearcher

/**
  * Created by shahzada.mansoor on 2/20/17.
  */
class FilterChecker(filter: String) {
  def matches(content:String) = content.contains(filter)

  def findMatchedFiles(iOObjects : List[IOObject]) = {
    for(iOObject <- iOObjects
        if(iOObjects.isInstanceOf[FileObject])
        if(matches(iOObject.name)))
      yield iOObject
  }
}
