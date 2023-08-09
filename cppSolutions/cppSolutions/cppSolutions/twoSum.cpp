#include <iostream>
#include <vector>
#include <map>

class Solution {
public:
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        std::vector<int> res;
        std::map<int, int> map;

        for (int i = 0; i < nums.size(); i++) {
            if (map.find(target - nums[i]) != map.end()) {
                res.push_back(map[target - nums[i]]);
                res.push_back(i);
                break;
            }
            map.insert(std::pair<int, int>(nums[i], i));
        }

        return res;
    }
};

/*int main(void) {
    Solution s = Solution();
    std::vector<int> res;
    res.push_back(2);
    res.push_back(7);
    res.push_back(11);
    res.push_back(15);

    res = s.twoSum(res, 9);
    for (int el : res) {
        std::cout << el << std::endl;
    }
    return 0;
}*/