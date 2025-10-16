import axios from "axios";

// 자재 추가
export const addDrawing = (drawing) => {
	return axios.post("/api/drawing/update", { name: drawing }).catch(e => e.response);
};

// 자재 삭제

// 모든 자재 조회

// 모든 부족한 자재 조회

// 필요한 자재 도면번호별로 조회

// 부족한 자재 도면번호별로 조회