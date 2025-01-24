# Mooluck Backend

<h2>🛠️ 개발 가이드 🛠️</h2>

### 📌 Branch 전략 및 커밋 규칙
프로젝트의 원활한 협업을 위해 아래 규칙을 준수하여 개발합니다.


### 🌱 개발, 커밋, 푸쉬
- **커밋 메시지를 명확하게 작성**하고 의미를 전달할 수 있도록 합니다.
- 원격지 브랜치로 **수시로 push**하여, 항상 작업 진행 상황을 동료가 확인할 수 있도록 합니다.

### ✏️ 커밋 메시지 규칙
커밋 메시지의 명확한 구분을 위해 다음 규칙을 준수합니다.
```
Feat: 새로운 기능 추가
Fix: 버그 수정
Docs: 문서 수정
Style: 코드 포맷팅, 세미콜론 누락 등 코드 변경이 없는 경우
Refactor: 코드 리팩토링
Test: 테스트 코드 추가 또는 리팩토링
Chore: 패키지 매니저 수정, 기타 변경
Design: CSS 등 UI 디자인 변경
Comment: 주석 추가 및 변경
Rename: 파일 또는 폴더 이름 변경
Remove: 파일 삭제
!BreakingChange: 커다란 API 변경
!HotFix: 치명적인 버그 긴급 수정
```
### 🔄 PR (Pull Request) 생성
- **피드백이나 도움이 필요할 때**, 또는 **merge 준비가 완료되었을 때**는 Pull Request를 생성합니다.
  - Pull Request는 코드 리뷰를 위한 시스템으로, 협업의 품질을 높이는 데 필수입니다.
  - **merge 준비 완료 시** `dev` 브랜치로 반영합니다.
  - 최종적으로 `dev`를 `master`에 반영하여 업데이트합니다.
    
### 📥 PR 예시 (Pull Request Example)
- **PR 제목 형식** : `[날짜]-[이름]-[기능] [작업 내용]`
 
 ```
  2024-11-06 무럭 로그인 기능 추가
  2024-11-06 무럭 목표 자산 조회 기능 CSS 수정
 ```

### 🚀 배포 방법
- `master`로 **merge가 일어나면 자동으로 배포**가 이루어지도록 설정(CI/CD).
- `master` 브랜치는 항상 최신 상태를 유지해야 합니다.

---

### 📚 참고 자료
[hyunjun.kr](https://hyunjun.kr/21)



