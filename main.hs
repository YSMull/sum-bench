import Control.Exception
import Data.Time

rst :: Int
rst = sum [1 .. 10 ^ 7]

main = do
    start <- getCurrentTime
    evaluate $ rst
    end <- getCurrentTime
    print (diffUTCTime end start)