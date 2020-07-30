package dynamic_problem;


/**
 * 0-1背包问题
 *      1、暴力解法：每一件物品都可以放进背包，也可以不放进背包。O((2^n)*n)
 *      2、动态规范——状态转移方程：F(n, C) 考虑将n个物品放进容量为C的背包，使得价值最大。
 *      F(n, C) = max(F(i-1, c), v(i) + F(i-1, c - w(i))
 *      O(n*C) O(n*C)
 *      3、优化：根据状态转移方程，第i行元素只依赖于第i-1行元素。理论上，只需要保持两行元素。
 *      空间复杂度：O(2*C） = O(c)
 *      4、优化加强：只使用一行大小为C的数组完成动态规划？
 *          从后向前刷新当前 memo 中元素。
 * 0-1背包问题的更多变种
 *      1、完全背包问题：每个物品可以无限使用。
 *      2、多重背包问题：每个物品不止1个，有num(i)个。
 *      3、多维费用背包问题：要考虑物品的体积和重量两个维度？
 *      4、物品间加入更多约束：物品间可以相互排斥或依赖。
 *
 * 416：
 *      1、F(n, C) 考虑将n个物品填满容量为C的背包。
 *      2、F(i, c) = F(i-1, c) || F(i-1, c-w(i))
 *      3、时间复杂度：O(n*sum/2) = O(n*sum)
 */
public class Solution416 {
}
