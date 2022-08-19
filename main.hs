import Control.Exception
import Data.Time

main = do
    start <- getCurrentTime
    evaluate $ sum [1..10000000]
    end <- getCurrentTime
    print (diffUTCTime end start)