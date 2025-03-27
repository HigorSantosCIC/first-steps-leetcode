Here's the complete Markdown (`.md`) file with all the content properly formatted:

```markdown
# LeetCode Java Solutions Starter

## 🚀 Quick Commands

Build the project:
```bash
./gradlew build
```

Run example tests:
```bash
./gradlew test
```

## 🏗 Project Structure

```
leetcode-java/
├── src/
│   ├── main/
│   │   └── java/org/leetcode/       # Solution implementations
│   └── test/
│       └── java/org/leetcode/       # Unit tests
├── build.gradle                     # Build configuration
├── gradle/
│   └── wrapper/                     # Gradle wrapper files
└── settings.gradle                  # Project settings
```

## 🧩 Adding New Solutions

Create package for your problem (e.g., "twosum"):
```bash
mkdir -p src/main/java/org/leetcode/twosum
mkdir -p src/test/java/org/leetcode/twosum
```

Implement your solution:
```java
// src/main/java/org/leetcode/twosum/Solution.java
package org.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }
}
```

Create corresponding tests:
```java
// src/test/java/org/leetcode/twosum/SolutionTest.java
package org.leetcode.twosum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testTwoSumBasicCase() {
        int[] result = solution.twoSum(new int[]{2,7,11,15}, 9);
        assertArrayEquals(new int[]{0,1}, result);
    }

    @Test
    public void testNoSolution() {
        assertThrows(IllegalArgumentException.class, () -> {
            solution.twoSum(new int[]{2,7,11,15}, 100);
        });
    }
}
```

## ⚙️ Build Commands

| Command | Description |
|---------|-------------|
| `./gradlew build` | Build the project |
| `./gradlew test` | Run all tests |
| `./gradlew clean` | Clean build artifacts |
| `./gradlew test --tests org.leetcode.*` | Run specific test class |

## 🛠️ IDE Setup

### IntelliJ IDEA
1. File → Open → Select `build.gradle`
2. Import as Gradle project
3. Enable auto-import

### VS Code
1. Install Java Extension Pack
2. Open project folder
3. Trust Gradle wrapper

## 🤝 Contributing

1. Fork the repository
2. Create a new branch:
```bash
git checkout -b feature/solution-for-problem-xyz
```
3. Add your solution with tests
4. Commit your changes:
```bash
git commit -m "Add solution for Problem XYZ"
```
5. Push to your fork:
```bash
git push origin feature/solution-for-problem-xyz
```
6. Create a Pull Request

## 📊 Example Problem Progress

| Problem | Solution | Tests | Difficulty |
|---------|----------|-------|------------|
| Two Sum | ✅ | ✅ | Easy |
| Add Two Numbers | ❌ | ❌ | Medium |
| Longest Substring | ❌ | ❌ | Medium |

## 📜 License

MIT License - See [LICENSE](LICENSE) for details.

## 🙌 Acknowledgments

- Inspired by LeetCode's problem set
- Built with Gradle and JUnit
- Community contributions welcome
