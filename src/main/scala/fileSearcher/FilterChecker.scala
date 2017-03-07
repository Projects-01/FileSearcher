package fileSearcher

/**
  * Created by shahzada.mansoor on 2/20/17.
  */
class FilterChecker(filter: String) {
  def matches(content:String) = content contains filter //infix notation e.g. 1 + 1

  def findMatchedFiles(iOObjects : List[IOObject]) =
    for(iOObject <- iOObjects
        if(iOObjects.isInstanceOf[FileObject])
        if(matches(iOObject.name)))
      yield iOObject
  }

object FilterChecker{
  def apply(filter:String): FilterChecker = new FilterChecker(filter)
}
