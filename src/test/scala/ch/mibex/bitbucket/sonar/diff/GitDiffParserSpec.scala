  private def readFile(path: String) =
    scala.io.Source.fromInputStream(getClass.getResourceAsStream(path)).mkString.replaceAll("\u0085", "")

            fromToRange = FromToRange(fromLineStart = 1, fromNumLines = Some(8), toLineStart = 1, toNumLines = Some(9)),
            fromToRange = FromToRange(fromLineStart = 18, fromNumLines = Some(6), toLineStart = 19, toNumLines = Some(8)),
              fromToRange = FromToRange(fromLineStart = 12, fromNumLines = None, toLineStart = 12, toNumLines = None),
              fromToRange = FromToRange(fromLineStart = 16, fromNumLines = None, toLineStart = 16, toNumLines = None),
              fromToRange = FromToRange(fromLineStart = 17, fromNumLines = Some(0), toLineStart = 18, toNumLines = Some(8)),
              fromToRange = FromToRange(fromLineStart = 1, fromNumLines = Some(40), toLineStart = 0, toNumLines = Some(0)),
              fromToRange = FromToRange(fromLineStart = 26, fromNumLines = Some(2), toLineStart = 26, toNumLines = Some(2)),
              fromToRange = FromToRange(fromLineStart = 40, fromNumLines = Some(0), toLineStart = 41, toNumLines = Some(7)),
              fromToRange = FromToRange(fromLineStart = 1, fromNumLines = Some(8), toLineStart = 1, toNumLines = Some(9)),
              fromToRange = FromToRange(fromLineStart = 18, fromNumLines = Some(6), toLineStart = 19, toNumLines = Some(8)),
      allDiffs must succeedOn(readFile("/diffs/2diffs-example.diff"))
      allDiffs must succeedOn(readFile("/diffs/5diffs-example.diff"))
      allDiffs must succeedOn(readFile("/diffs/u0085-char-issue.txt"))
    }

    "parse diff with another u2028 new line character" in {
      allDiffs must succeedOn(readFile("/diffs/u2028-char-issue.txt"))
    }
      allDiffs must succeedOn(readFile("/diffs/github#8.txt"))
      allDiffs must succeedOn(readFile("/diffs/github#8-no-newline-at-eof.txt"))
      allDiffs must succeedOn(readFile("/diffs/github#8-diff-wrong1.txt"))
      allDiffs must succeedOn(readFile("/diffs/github#8-diff-wrong3.txt"))
      allDiffs must succeedOn(readFile("/diffs/github#8-diff-wrong4.txt"))
      allDiffs must succeedOn(readFile("/diffs/github#10-no-index.txt"))
    }
    
    "Github issue #10 carriage return issue" in {
      allDiffs must succeedOn(readFile("/diffs/diff_pr_153_ko.diff.txt"))
    }

    "parse spaces in the git diff file path" in {
      allDiffs must succeedOn(readFile("/diffs/spaces-in-git-diff-path.txt"))
      allDiffs must succeedOn(readFile("/diffs/failing-diff.txt")).withResult(
                HunkHeader(FromToRange(0, Some(0), 1, Some(5)), None),
      allDiffs must succeedOn(readFile("/diffs/PR140.diff")).withResult(
                HunkHeader(FromToRange(1, Some(42), 0, Some(0)), None),
                HunkHeader(FromToRange(0,Some(0),1,Some(12)),None),