# Git & GitHub
## VCS
- 버전 관리 시스템 (VCS)
  - 파일 변경을 기록했다가 나중에 **특정 시점**의 버전의 코드를 체크 아웃할 수 있는 시스템
  - 각 파일, 프로젝트를 이전 상태로 되돌릴 수 있음.
  - 버전의 수정 내용을 비교해 볼 수 있음.
  - 파일의 버전을 수정한 팀원을 찾을 수 있음.
  - 소프트웨어 개발에서 개인 또는 팀 단위로 개발 중인 소스 코드를 관리할 때 사용
  - version control system은 버전을 관리하는 것이지만 그 산출물은 소스코드 뿐 아니라 문서 등 다양하다.
- LVCS (로컬 버전 관리)
  - 간단한 DB를 사용하는 정도
  - 많이 사용하는 도구: RCS(Revision Control System)
- CVCS (중앙집중식 버전 관리)
  - 파일을 별도로 관리하는 서버를 둠
  - 많이 사용하는 도구: CVS, Subversion, Perforce
  - 소규모에서 많이 사용

---
## Subversion
  - 소스 버전 관리 도구 - 시스템 형상 요소(소스, 데이터)를 문서화하고 관리하는 형상 관리 도구
  - 각 파일의 변경을 시점으로 관리 (델타 기반)
  - Commit
    - Git과 다른 의미
        
---
## **Git**
- **분산 버전 관리 시스템** DVCS, 마지막 버전의 소스를 체크아웃 하지 않고 히스토리와 더불어 전부 복제
- 서버에 문제가 생겨도 복제물로 작업 가능
- 리모트 저장소 (클라우드 원격 저장소)가 존재하며, 다양한 그룹과 다양한 방법으로 협업이 가능
- 원격저장소 : GitHub
- 특징
  - 변경사항 적절히 저장 후 필요한 시점으로 돌릴 수 있음
  - 서로 다른 변경 사항들을 쉽게 합칠 수 있음 
  - 네트워크가 끊어져도 작업 가능
  - 다른 버전 관리 시스템보다 빠름
  - 변경사항을 관리할 대상을 Stage를 관리할 수 있음
- 히스토리
  - 리눅스 커널 소스는 오픈 소스 프로젝트로 Bitkeeper라는 상용 DVCS를 무료로 사용하고 있었으나 그  관계가 틀어지며 자유 이용이 철회되었고 이러한 계기로 리누스 토발즈가 DVCS를 자체 개발
- 개발 원칙
  - 빠른 속도
  - 단순한 구조
  - 비선형적인 개발(수천 개의 동시 다발적인 Branch)
  - 완벽한 분산
  - Linux 커널 같은 대형 프로젝트에도 유용
- 파일 저장 방식
  - 데이터를 스냅샷의 연속으로 취급, 크기가 아주 작음
  - 파일이 달라지지 않았다면 새로 저장하지 않음, 이전 상태의 파일에 대한 링크만 저장
  - 커밋하거나 프로젝트의 상태를 저장할 때마다 파일이 존재하는 그 순간을 중요하게 여김
- 파일 관리
  - 세가지 상태로 관리
      | 상태        | 설명                           |
      | --------- | ---------------------------- |
      | Modified  | 수정한 파일을 아직 로컬 DB에 커밋하지 않은 것  |
      | Staged    | 현재 수정한 파일을 곧 커밋할 것이라고 표시한 상태 |
      | Committed | 데이터가 로컬 DB에 안전하게 저장됐다는 것     |
- 로컬 & 원격 저장소
  - 로컬 저장소 - 내 PC에 파일이 저장되는 개인 전용 저장소
  - 원격 저장소 - 파일이 원격 저장소 전용 서버에서 관리되며 여러 사람이 함께 공유하기 위한 저장소
  - 로컬 저장소에 커밋한 작업 내용을 공개하고 싶을 때 원격 저장소에 업로드 (push) 한다.
  - 원격 저장소에서 다른 사람이 작업한 파일을 로컬 저장소로 가져올 때 Pull 한다.

---

## GitHub
- Git을 사용하는 소프트웨어 개발의 버전 관리를 위한 인터넷 호스팅 서비스
- 분산 버전 관리 기능, 접근 제어, 버그 추적, 작업 관리, 지속적인 통합 기능이 있음.
### Branch
- 커밋의 묶음, 특정 커밋을 기준으로 Branch 생성 가능
- Branch를 이용하면 협업 프로젝트 시 다른 Branch의 커밋에 영향을 받지 않고 작업
- 이슈가 생기면 Branch를 생성하여 개발
- 배포된 버전에 문제가 생겼을 때 이슈를 개발 중인 Branch는 유지, 배포된 커밋에 수정용 Branch를 생성해 문제 해결
- 
